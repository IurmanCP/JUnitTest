public class Calculator{
        public int addition(int x, int y ){
            return x + y;
        }


        public int divide (int x, int y){
            if (y == 0 ){
                return 0;
            }
            else{
                return x/y;
            }
        }

        public boolean esPar(int x){
            return x % 2 == 0;
        }
}