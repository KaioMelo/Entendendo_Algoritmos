public class Main {
    public static void main(String[] args) {
        int[] list = {1, 3, 5, 7, 9};

        System.out.println(pesquisa_binaria(list, 3));
        System.out.println(pesquisa_binaria(list, 9));
        System.out.println(pesquisa_binaria(list, -1));
    }
    private static Integer pesquisa_binaria(int[] list, int item){
        int baixo = 0;
        int alto = list.length - 1;

        while (baixo <= alto){
            int meio = (baixo + alto) / 2;
            int chute = list[meio];
            if(chute == item){
                return meio;
            } else if (chute > item) {
                alto = meio - 1;
            }else{
                baixo = meio + 1;
            }
        }
        return null;
    }
}
