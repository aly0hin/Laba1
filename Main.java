import stek.Stek;
public class Main {
    public static void main(String[] args) {
        //Флаг отвечающий за то нормальные скобки или нет
        int Glue = 1;

        Stek stekskobokotkr = new Stek();

        String skobkiprime = "({}[)]";
        int dlinna = skobkiprime.length();

        for (int i = 0; i < dlinna; i++) {
            //Получаем i-ый элемент из строки
            char simv = skobkiprime.charAt(i);
            //Если это открытая скобка то добавляем её в стек
            if (simv == '[' || simv == '(' || simv == '{'){
            stekskobokotkr.push(simv);
            }
            //Если нет то проверяем не пустой ли стек открытых скобок, если пустой, то не подходит
            else {
                if (stekskobokotkr.kursor == 0) {
                    System.out.println("Ноу");
                    Glue -= 1;
                    break;
                }
                //Если закрытая скобка совпадает с последней открытой (верх стека), то всё окей
                //И удаляем последнюю открытую
                char verh = stekskobokotkr.pop();
                if (simv == ']' & verh == '['){continue;}
                if (simv == '}' & verh == '{'){continue;}
                if (simv == ')' & verh == '('){continue;}
                //Иначе - не подходит
                else {
                    System.out.println("Ноу");
                    Glue -= 1;
                    break;
                }
                }
            }
        //Проверяем пуст ли стек открытых скобок, если да, то всё окей, если нет - не подходит
        if (Glue == 1 & stekskobokotkr.kursor != 0) {
            Glue -= 1;
            System.out.println("Ноу");
        }
        if (Glue == 1){
            System.out.println("Yes");
        }
    }
}
