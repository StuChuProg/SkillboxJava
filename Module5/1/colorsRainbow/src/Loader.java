public class Loader {
    public static void main(String[] args){
        String[] color = {"red", "orange", "yellow", "green", "blue", "purple"};
        for (int i = 0; i<color.length; i++){
            System.out.println(color[i]);
        }
        for (int i =color.length-1; i>=0; i--){
            System.out.println(color[i]);
        }
    }
}
