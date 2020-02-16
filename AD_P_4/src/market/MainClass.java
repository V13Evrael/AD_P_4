package market;

import java.sql.ResultSet;
import java.sql.Statement;

import com.matisse.MtDatabase;
import com.matisse.MtException;
import com.matisse.MtObjectIterator;
import com.matisse.MtPackageObjectFactory;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hostname = "localhost";
		String dbname = "Mercado";

		// Primera ejecución:
		// creaObjeto(hostname, dbname);

		// Segunda ejecución:
		// borrarInstancias(hostname, dbname, "Producto");

		// Tercera ejecución:
		// modificaObjeto(hostname, dbname, "Everis", "SA");

		// Cuarta ejecución:
		ejecutaOQL(hostname, dbname);

	}

	public static void creaObjeto(String hostname, String dbname) {

		try {
			MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", "market"));
			db.open();
			db.startTransaction();
			System.out.println("Conectado a la base de datos " + db.toString() + " de Matisse");

			// Creamos un objeto de tipo Empresa
			Empresa empresa1 = new Empresa(db);
			empresa1.setNombreEmpresa("Everis");
			empresa1.setDireccionEmpresa("C/Bonita , S/N");
			empresa1.setTipoEmpresa("SL");
			empresa1.setCifEmpresa("123456789H");
			empresa1.setAnyoCreacionEmpresa(2001);
			System.out.println("Empresa Everis creada");

			// Creamos un objeto App
			App app1 = new App(db);
			app1.setNombreProducto("SuperApp");
			app1.setPlataformaApp("Android");
			app1.setFechaEntregaProducto("14 de Febrero de 2020");
			System.out.println("App SuperApp creada");

			// Creamos un objeto Web
			Web web1 = new Web(db);
			web1.setNombreProducto("TodoDatos");
			web1.setFechaEntregaProducto("29 de Febrero de 2020");
			web1.setUrlWeb("www.tododatos.org");
			System.out.println("Web TodoDatos creada");

			// Añadimos un array donde guardaremos los productos que introduciremos en
			// Everis
			Producto[] productosEveris = new Producto[2];
			productosEveris[0] = app1;
			productosEveris[1] = web1;

			// Guardamos la relación de Everis con los productos desarrollados
			empresa1.setDesarrolla(productosEveris);

			// Ejecutamos el commit
			db.commit();

			// Cerramos la conexión con la base de datos
			db.close();

			System.out.println("Finalizado con éxito");

		} catch (MtException mte) {
			System.out.println("Se produjo un error: " + mte.getMessage());
		}

	}

	public static void borrarInstancias(String hostname, String dbname, String clase) {

		try {
			MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", "market"));
			db.open();
			db.startTransaction();

			if (clase.equals("App") | clase.equals("Producto")) {

				App.getClass(db).removeAllInstances();
			}

			if (clase.equals("Web") | clase.equals("Producto")) {

				Web.getClass(db).removeAllInstances();
			}

			if (clase.equals("Empresa")) {

				Empresa.getClass(db).removeAllInstances();
			}

			db.commit();
			db.close();

			System.out.println("Finalizado con éxito");

		} catch (MtException mte) {

			System.out.println("Se produjo un error: " + mte.getMessage());
		}
	}

	public static void modificaObjeto(String hostname, String dbname, String nombre, String nuevoTipo) {

		int nEmpresas = 0;

		try {

			MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", "market"));
			db.open();
			db.startTransaction();

			nEmpresas = (int) Empresa.getInstanceNumber(db);

			MtObjectIterator<Empresa> iterador = Empresa.<Empresa>instanceIterator(db);

			while (iterador.hasNext()) {
				Empresa[] empresas = iterador.next(nEmpresas);
				for (int i = 0; i < empresas.length; i++) {
					if (empresas[i].getNombreEmpresa().compareTo(nombre) == 0) {
						empresas[i].setTipoEmpresa(nuevoTipo);
					}
				}
			}

			iterador.close();

			db.commit();
			db.close();

			System.out.println("Finalizado con éxito");

		} catch (MtException mte) {

			System.out.println("Se produjo un error: " + mte.getMessage());
		}
	}

	public static void ejecutaOQL(String hostname, String dbname) {

		try {

			MtDatabase db = new MtDatabase(hostname, dbname);

			db.open();

			Statement st = db.createStatement();
			String sentencia = "SELECT REF(a) from market.Empresa a;";

			ResultSet rs = st.executeQuery(sentencia);
			Empresa empresa1;

			while (rs.next()) {
				empresa1 = (Empresa) rs.getObject(1);
				System.out.println("Empresa: " + empresa1.getNombreEmpresa() + "\nDirección: "
						+ empresa1.getDireccionEmpresa() + "\nTipo: " + empresa1.getTipoEmpresa() + "\nCIF: "
						+ empresa1.getCifEmpresa() + "\nAño Creación: " + empresa1.getAnyoCreacionEmpresa());
			}

		} catch (Exception e) {
		}
	}
}
