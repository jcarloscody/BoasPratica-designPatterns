package impostor;

public enum TipoImposto {
    ICMS{
        @Override
        String aliquota() {
            return "0.1";
        }
    },
    ISS{
        @Override
        String aliquota() {
            return "0.5";
        }
    };

    abstract String aliquota();

}
