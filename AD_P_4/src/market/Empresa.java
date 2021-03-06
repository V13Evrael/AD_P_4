/*
 * Empresa.java
 *
 * Generated with Matisse Schema Definition Language 9.1.12
 * Generation date: Sun Feb 09 22:49:15 2020
 */

// Note: the package and extends declarations are generated by mt_sdl, do not modify them

package market;

import com.matisse.reflect.*;

/**
 * <code>Empresa</code> is a schema class generated by <code>mt_sdl</code>.
 * Any user-written classes will be found at the end of the file, after
 * the '// END of Matisse SDL Generated Code' comment.
 * Attribute types, default values, and relationship minimum and maximum
 * cardinality are stored in the database itself, not in this source code.
 * For more information, see <i>Getting Started with MATISSE</i>.
 */
public class Empresa extends com.matisse.reflect.MtObject {

    // BEGIN Matisse SDL Generated Code
    // DO NOT MODIFY UNTIL THE 'END of Matisse SDL Generated Code' MARK BELOW
    /*
     * Generated with Matisse Schema Definition Language 9.1.12
     * Generation Date: Sun Feb 09 22:49:15 2020
     */

    /*
     * Class variables and methods
     */

    /** Class <code>Empresa</code> cache ID */
    private static int CID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtClass.Loader("market.Empresa"));

    /**
     * Gets the <code>Empresa</code> class descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return a class descriptor
     */
    public static com.matisse.reflect.MtClass getClass(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtClass)db.getCachedObject(CID);
    }

    /**
     * Factory constructor. This constructor is called by <code>MtObjectFactory</code>.
     * It is public for technical reasons but is not intended to be called
     * directly by user methods.
     * @param db a database
     * @param mtOid an existing object ID in the database
     */
    public Empresa(com.matisse.MtDatabase db, int mtOid)  {
        super(db, mtOid);
    }

    /**
     * Cascaded constructor, used by subclasses to create a new object in the database.
     * It is protected for technical reasons but is not intended to be called
     * directly by user methods.
     * @param mtCls a class descriptor (the class to instantiate)
     */
    protected Empresa(com.matisse.reflect.MtClass mtCls)  {
        super(mtCls);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>instanceIterator(Empresa.class);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>instanceIterator(numObjPerBuffer, Empresa.class);
    }

    /**
     * Counts the number of instances of this class (and its subclasses).
     * @param db a database
     * @return total number of instances
     */
    public static long getInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getInstanceNumber();
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>ownInstanceIterator(Empresa.class);
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>ownInstanceIterator(numObjPerBuffer, Empresa.class);
    }

    /**
     * Counts the number of own instances of this class (excluding subclasses).
     * @param db a database
     * @return total number of instances
     */
    public static long getOwnInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getOwnInstanceNumber();
    }

    /*
     * Attribute access methods
     */

    /* Attribute 'nombreEmpresa' */

    /** Attribute <code>nombreEmpresa</code> cache ID */
    private static int nombreEmpresaCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("nombreEmpresa",CID));

    /**
     * Gets the <code>nombreEmpresa</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getNombreEmpresaAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(nombreEmpresaCID);
    }


    /**
     * Gets the <code>nombreEmpresa</code> attribute value.
     * @return the value
     *
     * @see #setNombreEmpresa
     * @see #removeNombreEmpresa
     */
    public final String getNombreEmpresa() {
        return getString(getNombreEmpresaAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>nombreEmpresa</code> attribute value.
     * @param val the new value
     *
     * @see #getNombreEmpresa
     * @see #removeNombreEmpresa
     */
    public final void setNombreEmpresa(String val) {
        setString(getNombreEmpresaAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>nombreEmpresa</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getNombreEmpresa
     * @see #setNombreEmpresa
     */
    public final void removeNombreEmpresa() {
        removeValue(getNombreEmpresaAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getNombreEmpresa
     * @see #setNombreEmpresa
     */
    public final boolean isNombreEmpresaNull() {
        return isNull(getNombreEmpresaAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getNombreEmpresa
     * @see #setNombreEmpresa
     */
    public final boolean isNombreEmpresaDefaultValue() {
        return isDefaultValue(getNombreEmpresaAttribute(getMtDatabase()));
    }


    /* Attribute 'direccionEmpresa' */

    /** Attribute <code>direccionEmpresa</code> cache ID */
    private static int direccionEmpresaCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("direccionEmpresa",CID));

    /**
     * Gets the <code>direccionEmpresa</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getDireccionEmpresaAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(direccionEmpresaCID);
    }


    /**
     * Gets the <code>direccionEmpresa</code> attribute value.
     * @return the value
     *
     * @see #setDireccionEmpresa
     * @see #removeDireccionEmpresa
     */
    public final String getDireccionEmpresa() {
        return getString(getDireccionEmpresaAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>direccionEmpresa</code> attribute value.
     * @param val the new value
     *
     * @see #getDireccionEmpresa
     * @see #removeDireccionEmpresa
     */
    public final void setDireccionEmpresa(String val) {
        setString(getDireccionEmpresaAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>direccionEmpresa</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getDireccionEmpresa
     * @see #setDireccionEmpresa
     */
    public final void removeDireccionEmpresa() {
        removeValue(getDireccionEmpresaAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getDireccionEmpresa
     * @see #setDireccionEmpresa
     */
    public final boolean isDireccionEmpresaNull() {
        return isNull(getDireccionEmpresaAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getDireccionEmpresa
     * @see #setDireccionEmpresa
     */
    public final boolean isDireccionEmpresaDefaultValue() {
        return isDefaultValue(getDireccionEmpresaAttribute(getMtDatabase()));
    }


    /* Attribute 'tipoEmpresa' */

    /** Attribute <code>tipoEmpresa</code> cache ID */
    private static int tipoEmpresaCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("tipoEmpresa",CID));

    /**
     * Gets the <code>tipoEmpresa</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getTipoEmpresaAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(tipoEmpresaCID);
    }


    /**
     * Gets the <code>tipoEmpresa</code> attribute value.
     * @return the value
     *
     * @see #setTipoEmpresa
     * @see #removeTipoEmpresa
     */
    public final String getTipoEmpresa() {
        return getString(getTipoEmpresaAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>tipoEmpresa</code> attribute value.
     * @param val the new value
     *
     * @see #getTipoEmpresa
     * @see #removeTipoEmpresa
     */
    public final void setTipoEmpresa(String val) {
        setString(getTipoEmpresaAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>tipoEmpresa</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getTipoEmpresa
     * @see #setTipoEmpresa
     */
    public final void removeTipoEmpresa() {
        removeValue(getTipoEmpresaAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getTipoEmpresa
     * @see #setTipoEmpresa
     */
    public final boolean isTipoEmpresaNull() {
        return isNull(getTipoEmpresaAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getTipoEmpresa
     * @see #setTipoEmpresa
     */
    public final boolean isTipoEmpresaDefaultValue() {
        return isDefaultValue(getTipoEmpresaAttribute(getMtDatabase()));
    }


    /* Attribute 'cifEmpresa' */

    /** Attribute <code>cifEmpresa</code> cache ID */
    private static int cifEmpresaCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("cifEmpresa",CID));

    /**
     * Gets the <code>cifEmpresa</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getCifEmpresaAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(cifEmpresaCID);
    }


    /**
     * Gets the <code>cifEmpresa</code> attribute value.
     * @return the value
     *
     * @see #setCifEmpresa
     * @see #removeCifEmpresa
     */
    public final String getCifEmpresa() {
        return getString(getCifEmpresaAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>cifEmpresa</code> attribute value.
     * @param val the new value
     *
     * @see #getCifEmpresa
     * @see #removeCifEmpresa
     */
    public final void setCifEmpresa(String val) {
        setString(getCifEmpresaAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>cifEmpresa</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getCifEmpresa
     * @see #setCifEmpresa
     */
    public final void removeCifEmpresa() {
        removeValue(getCifEmpresaAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getCifEmpresa
     * @see #setCifEmpresa
     */
    public final boolean isCifEmpresaNull() {
        return isNull(getCifEmpresaAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getCifEmpresa
     * @see #setCifEmpresa
     */
    public final boolean isCifEmpresaDefaultValue() {
        return isDefaultValue(getCifEmpresaAttribute(getMtDatabase()));
    }


    /* Attribute 'anyoCreacionEmpresa' */

    /** Attribute <code>anyoCreacionEmpresa</code> cache ID */
    private static int anyoCreacionEmpresaCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("anyoCreacionEmpresa",CID));

    /**
     * Gets the <code>anyoCreacionEmpresa</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getAnyoCreacionEmpresaAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(anyoCreacionEmpresaCID);
    }


    /**
     * Gets the <code>anyoCreacionEmpresa</code> attribute value.
     * @return the value
     *
     * @see #setAnyoCreacionEmpresa
     * @see #removeAnyoCreacionEmpresa
     */
    public final int getAnyoCreacionEmpresa() {
        return getInteger(getAnyoCreacionEmpresaAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>anyoCreacionEmpresa</code> attribute value.
     * @param val the new value
     *
     * @see #getAnyoCreacionEmpresa
     * @see #removeAnyoCreacionEmpresa
     */
    public final void setAnyoCreacionEmpresa(int val) {
        setInteger(getAnyoCreacionEmpresaAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>anyoCreacionEmpresa</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getAnyoCreacionEmpresa
     * @see #setAnyoCreacionEmpresa
     */
    public final void removeAnyoCreacionEmpresa() {
        removeValue(getAnyoCreacionEmpresaAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getAnyoCreacionEmpresa
     * @see #setAnyoCreacionEmpresa
     */
    public final boolean isAnyoCreacionEmpresaNull() {
        return isNull(getAnyoCreacionEmpresaAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getAnyoCreacionEmpresa
     * @see #setAnyoCreacionEmpresa
     */
    public final boolean isAnyoCreacionEmpresaDefaultValue() {
        return isDefaultValue(getAnyoCreacionEmpresaAttribute(getMtDatabase()));
    }


    /*
     * Relationship access methods
     */

    /* Relationship 'desarrolla' */

    /** Relationship <code>desarrolla</code> cache ID */
    private static int desarrollaCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtRelationship.Loader("desarrolla",CID));

    /**
     * Gets the <code>desarrolla</code> relationship descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return a relationship descriptor object
     */
    public static com.matisse.reflect.MtRelationship getDesarrollaRelationship(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtRelationship)db.getCachedObject(desarrollaCID);
    }

    /**
     * Gets the <code>desarrolla</code> relationship's successors.
     * @return an array of objects
     *
     * @see #getDesarrollaSize
     * @see #desarrollaIterator
     * @see #setDesarrolla
     * @see #removeDesarrolla
     */
    public final market.Producto[] getDesarrolla() {
        return (market.Producto[])getSuccessors(getDesarrollaRelationship(getMtDatabase()), market.Producto.class);
    }

    /**
     * Counts the <code>desarrolla</code> relationship's successors.
     * @return the number of successors
     *
     * @see #getDesarrolla
     * @see #desarrollaIterator
     * @see #setDesarrolla
     * @see #removeDesarrolla
     */
    public final int getDesarrollaSize() {
        return getSuccessorSize(getDesarrollaRelationship(getMtDatabase()));
    }

    /**
     * Opens an iterator on the <code>desarrolla</code> relationship's successors.
     * @param <E> a MtObject class     * @return an object iterator
     *
     * @see #getDesarrolla
     * @see #getDesarrollaSize
     * @see #setDesarrolla
     * @see #removeDesarrolla
     */
    public final <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> desarrollaIterator() {
        return this.<E>successorIterator(getDesarrollaRelationship(getMtDatabase()), market.Producto.class);
    }

    /**
     * Sets the <code>desarrolla</code> relationship's successors.
     * @param succs an array of objects
     *
     * @see #getDesarrolla
     * @see #getDesarrollaSize
     * @see #desarrollaIterator
     * @see #removeDesarrolla
     */
    public final void setDesarrolla(market.Producto[] succs) {
        setSuccessors(getDesarrollaRelationship(getMtDatabase()), succs);
    }

    /**
     * Inserts one object at the beginning of the existing <code>desarrolla</code> successors list.
     * @param succ the object to add
     *
     * @see #getDesarrolla
     * @see #getDesarrollaSize
     * @see #desarrollaIterator
     * @see #setDesarrolla
     * @see #removeDesarrolla
     */
    public final void prependDesarrolla(market.Producto succ) {
        prependSuccessor(getDesarrollaRelationship(getMtDatabase()), succ);
    }

    /**
     * Adds one object to the end of the existing <code>desarrolla</code> successors list.
     * @param succ the object to add
     *
     * @see #getDesarrolla
     * @see #setDesarrolla
     * @see #removeDesarrolla
     * @see #getDesarrollaSize
     * @see #desarrollaIterator
     */
    public final void appendDesarrolla(market.Producto succ) {
        appendSuccessor(getDesarrollaRelationship(getMtDatabase()), succ);
    }
    /** Adds multiple objects to the end of the existing <code>desarrolla</code> successors list.
     * @param succs an array of objects to add
     *
     * @see #getDesarrolla
     * @see #setDesarrolla
     * @see #removeDesarrolla
     * @see #getDesarrollaSize
     * @see #desarrollaIterator
     */
    public final void appendDesarrolla(market.Producto[] succs) {
        addSuccessors(getDesarrollaRelationship(getMtDatabase()), succs);
    }

    /**
     * Removes objects from the <code>desarrolla</code> successors list.
     * @param succs an array of objects to remove
     *
     * @see #getDesarrolla
     * @see #setDesarrolla
     * @see #getDesarrollaSize
     * @see #desarrollaIterator
     */
    public void removeDesarrolla(market.Producto[] succs) {
        removeSuccessors(getDesarrollaRelationship(getMtDatabase()), succs);
    }

    /**
     * Removes one object from the <code>desarrolla</code> successors list.
     * @param succ the object to remove
     *
     * @see #getDesarrolla
     * @see #setDesarrolla
     * @see #getDesarrollaSize
     * @see #desarrollaIterator
     */
    public void removeDesarrolla(market.Producto succ) {
        removeSuccessor(getDesarrollaRelationship(getMtDatabase()), succ);
    }

    /**
     * Removes all <code>desarrolla</code> successors.  When the minimum cardinality
     * is 1, a new successor must be set before commit.
     */
    public final void clearDesarrolla() {
        clearSuccessors(getDesarrollaRelationship(getMtDatabase()));
    }


    // END of Matisse SDL Generated Code

    /*
     * You may add your own code here...
     */

    /**
     * Default constructor provided as an example.
     * You may delete this constructor or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @param db a database
     */
    public Empresa(com.matisse.MtDatabase db) {
        super(getClass(db));
    }

    /**
     * Example of <code>toString</code> method.
     * You may delete this method or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @return a string
     */
    public java.lang.String toString() {
        return super.toString() + "[Empresa]";
    }
}
