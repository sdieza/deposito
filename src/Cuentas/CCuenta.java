/**
 * @author Sergio Diez Alonso
 * @version 1.0
 */
/**
 * Package Cuentas
 */
package Cuentas;

/**
 * Clase Cuentas, que contiene los métodos de la clase "Cuentas"
 */
public class CCuenta {

    /** Parametros de la clase "CCuenta"
     * @param String nombre
     * @param String cuenta
     * @param double saldo
     * @param double tipoInteres
     */ 
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Método constructor vacio de la clase "CCuenta".
     */
    public CCuenta() {
    }

    /**
     * Método constructor de la clase "CCuenta".
     *
     * @param nom parametro String del Nombre.
     * @param cue Parametro String del número de cuenta.
     * @param sal Parametro Double del saldo de la cuenta.
     * @param tipo parametro Double del tipo de interes.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Método asignarNombre que asigna un nombre al objeto clase.
     *
     * @param nom Parametro String del nombre que se asigna al objeto.
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Método ObtenerNombre que obtiene el nombre de un objeto.
     *
     * @return getNombre que devuelve el valor nombre del objeto.
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Método estado que obtiene el saldo del objeto.
     *
     * @return getSaldo que retorna un Double del valor del saldo del objeto.
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Método Ingresar del Objeto "CCuenta"
     *
     * @param cantidad Parametro Double de la cantidad que queremos añadir al
     * objeto "CCuenta"
     * @throws Exception Controlamos la excepción de errores.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método retirar que permite eliminar una cantidad del objeto "CCuenta".
     *
     * @param cantidad Parametro Double que es la cantidad que se retirará del
     * objeto "CCuenta".
     * @throws Exception Controlamos las excepciones del método.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método ObtenerCuenta que permite recuperar el valor de la cuenta.
     *
     * @return getCuenta devuelve un valor String con el valor de la cuenta.
     */
    public String obtenerCuenta() {
        return getCuenta();
    }

    /**
     * Método getNombre que permite recuperar el valor del nombre del objeto.
     *
     * @return devuelve un String con el valor del nombre del objeto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setNombre que añade el String nombre el objeto "CCuenta"
     *
     * @param nombre Parametro String con el valor nombre para añadir al objeto
     * "CCuenta"
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getTipoInteres que recupera el tipo de interes.
     *
     * @return tipoInteres un Double con el valor del tipo de interés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método setTipoInteres que establece el valor de tipoInteres
     * @param tipoInterés un double que estable el valor tipoInteres.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Método getCuenta que devuelve la cuenta
     * @return cuenta, un String con el valor de cuenta del objeto.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método setCuenta que establece la cuenta
     * @param cuenta, establece un String con el número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método getSaldo que devuelve el saldo de la cuenta.
     * @return saldo, devuelve el saldo del objeto.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método setSaldo que establece el saldo del objeto cuenta.
     * @param saldo, devuelve el saldo del objeto.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
