public class EsempioAppend
{
    public static void main(String[]args)
    {
        StringBuilder esempio = new StringBuilder();
        esempio.append("Ciao");

        esempio.append(" amico");

        esempio.insert(4, " come stai");

        esempio.insert(1, 12);

        String convertire = esempio.toString();

        System.out.println(esempio);
    }    
}
