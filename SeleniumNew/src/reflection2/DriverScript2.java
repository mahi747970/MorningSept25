package reflection2;

public class DriverScript2
{
    public static void main(String[] args) {
        try{
            Class.forName("reflection2.TestScript2");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
