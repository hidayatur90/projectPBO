package ProjectAkhir;

public class Main {
    public static void main(String[] args) {
        // 1. Penggunaan exception handling

        int[] numbers = {1,2,3};

        for (int i = 0; i <= numbers.length; i++){
            try{
                System.out.println(numbers[i] + 5 + " try");
            }
            catch (Exception ArrayIndexOutOfBoundsException){
                System.out.println("Ini catch");
            }
            finally {
                try {
                    System.out.println(numbers[i] + " finally");
                }
                catch (Exception ArrayIndexOutOfBoundsException) {
                    System.out.println("Ini catch untuk finally");
                }
            }
        }

        // 2. Membuat method yg memungkinkan terjadinya exception
        // 3. Membuat class method overiding exception
        // 4. Membuat class subclass exception


    }
}
