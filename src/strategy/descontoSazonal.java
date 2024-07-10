package strategy;

public class descontoSazonal implements EstrategiaDesconto{
    @Override
    public double aplicarDesconto ( double valor ) {
        return valor * 0.08;
    }
}
