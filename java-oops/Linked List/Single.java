public class Single {

    private class Singleton {
        int a;

        private static Singleton singleton;

        private Singleton(int a) {
            this.a = a;
        }

        public static Singleton getInstance(int a) {
            if (singleton == null)
                singleton = new Singleton(a);

            return singleton;
        }
    }
}