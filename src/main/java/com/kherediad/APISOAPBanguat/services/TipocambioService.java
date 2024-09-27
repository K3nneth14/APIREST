package com.kherediad.APISOAPBanguat.services;

@Service
public class TipoCambioService {
    public String obtenerTipoCambioDelDia() {
        return llamarApiSoapParaTipoCambioDelDia();
    }
    public String obtenerTipoCambioPorFecha(String fecha) {
        return llamarApiSoapParaTipoCambioPorFecha(fecha);
    }
    public String obtenerTipoCambioPorFechaYMoneda(String fecha, String moneda) {
        // Lógica para obtener el tipo de cambio específico por fecha y moneda
        return llamarApiSoapParaTipoCambioPorFechaYMoneda(fecha, moneda);
    }

    public List<String> obtenerTiposCambioEnRango(String fechaInicio, String fechaFin) {
        // Lógica para obtener los tipos de cambio dentro de un rango de fechas
        return llamarApiSoapParaTiposCambioEnRango(fechaInicio, fechaFin);
    }

    public List<String> obtenerTiposCambioRangoMoneda(String fechaInicio, String fechaFin, String moneda) {
        // Lógica para obtener los tipos de cambio dentro de un rango de fechas y para una moneda específica
        return llamarApiSoapParaTiposCambioRangoMoneda(fechaInicio, fechaFin, moneda);
    }
    private String llamarApiSoapParaTipoCambioDelDia() {
        return "Tipo de Cambio del Día: 7.73";
    }

    private String llamarApiSoapParaTipoCambioPorFecha(String fecha) {
        return "Tipo de Cambio en " + fecha + ": 7.73";
    }
    private String llamarApiSoapParaTipoCambioPorFechaYMoneda(String fecha, String moneda) {
        return "Tipo de Cambio en " + fecha + " para " + moneda + ": 7.73";
    }
    private List<String> llamarApiSoapParaTiposCambioEnRango(String fechaInicio, String fechaFin) {
        return Arrays.asList("Tipo de Cambio del 26-09-2024: 7.75", "Tipo de Cambio del 26-09-2024: 7.75");
    }
    private List<String> llamarApiSoapParaTiposCambioRangoMoneda(String fechaInicio, String fechaFin, String moneda) {
        // Simulación de llamada a API SOAP
        return Arrays.asList("Tipo de Cambio del 26-09-2024 para " + moneda + ": 7.73", "Tipo de Cambio del 02-01-2024 para " + moneda + ": 7.75");
    }
}
