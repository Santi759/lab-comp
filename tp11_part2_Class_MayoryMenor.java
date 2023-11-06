import java.util.ArrayList;
public class MayoryMenor {
        private ArrayList <Integer> nums;

        public MayoryMenor(){
                nums = new ArrayList<>();
        }
        public void agregarNum(int num){
                nums.add(num);
        }
        public void mostrarLista(){
                for (int i=0;i<nums.size();i++){
                        System.out.print(nums.get(i)+"--");
                }
                System.out.println(" ");
        }

        public int numMay(){
                int may=0;
                for (int i=0;i<nums.size();i++){
                        if (nums.get(i)>may){
                                may=nums.get(i);
                        }
                }
                return may;
        }

        public int numMen(){
                int men = nums.get(0);
                for (int i=0;i<nums.size();i++){
                        if (nums.get(i)<men){
                                men=nums.get(i);
                        }
                }
                return men;
        }

        public int distancia(){
                return numMay()- numMen();
        }
}
