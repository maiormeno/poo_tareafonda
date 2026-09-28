package cl.dsy1102.fonda;

import java.util.*;

public interface ConsumoResponsable {

    boolean tieneVentaRestringida();

    void restringirVenta();

    boolean superaLimite(int unidades);
}
