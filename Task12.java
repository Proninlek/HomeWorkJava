public class Task12 {
    static boolean ex2(String line){
        /*
        Написать программу, определяющую правильность расстановки скобок в выражении.
        Пример 1: a+(d*3) - истина
        Пример 2: [a+(1]*3) - ложь
        Пример 3: [6+(3*3)] - истина
        Пример 4: {a}[+]{(d*3)} - истина
        Пример 5: <{a}+{(d*3)}> - истина
        Пример 6: {a+]}{(d*3)} - ложь
        */
        Stack<Character> stack = new Stack<>();
        char[] c1 = line.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        map.put('<','>');
        
        for (int i = 0; i < c1.length; i++) {
            if (map.containsKey(c1[i])){
                stack.push(c1[i]);
            }
            if (map.containsValue(c1[i])){
                if (stack.isEmpty() || stack.pop() != '('){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
