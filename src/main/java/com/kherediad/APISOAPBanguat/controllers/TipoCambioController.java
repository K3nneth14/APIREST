package com.kherediad.APISOAPBanguat.controllers;

@RestController
@RequestMapping("/api/cambio")
public class TipoCambioController {

    @Autowired
    private TipoCambioService tipoCambioService;

    @GetMapping("/dia")
    public ResponseEntity<String> obtenerTipoCambioDia() {
        String tipoCambio = tipoCambioService.obtenerTipoCambioDelDia();
        return ResponseEntity.ok(tipoCambio);
    }

    @GetMapping("/fecha-inicial")
    public ResponseEntity<String> obtenerTipoCambioFechaInicial(@RequestParam String fecha) {
        String tipoCambio = tipoCambioService.obtenerTipoCambioPorFecha(fecha);
        return ResponseEntity.ok(tipoCambio);
    }

    @GetMapping("/fecha-inicial-moneda")
    public ResponseEntity<String> obtenerTipoCambioFechaInicialMoneda(@RequestParam String fecha, @RequestParam String moneda) {
        String tipoCambio = tipoCambioService.obtenerTipoCambioPorFechaYMoneda(fecha, moneda);
        return ResponseEntity.ok(tipoCambio);
    }

    @GetMapping("/rango")
    public ResponseEntity<List<String>> obtenerTipoCambioRango(@RequestParam String fechaInicio, @RequestParam String fechaFin) {
        List<String> tiposCambio = tipoCambioService.obtenerTiposCambioEnRango(fechaInicio, fechaFin);
        return ResponseEntity.ok(tiposCambio);
    }

    @GetMapping("/rango-moneda")
    public ResponseEntity<List<String>> obtenerTipoCambioRangoMoneda(@RequestParam String fechaInicio, @RequestParam String fechaFin, @RequestParam String moneda) {
        List<String> tiposCambio = tipoCambioService.obtenerTiposCambioRangoMoneda(fechaInicio, fechaFin, moneda);
        return ResponseEntity.ok(tiposCambio);
    }
}
