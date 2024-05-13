package koschei.models;


public class Egg6 {

    private Needle7 needle7;
    // @Autowired можно и сверху и снизу,
    // но в условии просили еще @Bean на методе в AppConfig,
    // а без конструктора не получается
    public Egg6(Needle7 needle7) {
        this.needle7 = needle7;
    }

    @Override
    public String toString() {
        return (", в яйце иголка " + needle7.toString());
    }
}
