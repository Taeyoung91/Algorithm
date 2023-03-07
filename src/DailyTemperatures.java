import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Temperature> stack = new Stack<>();

        int[] answer = new int[temperatures.length];

        for (int i=0; i < temperatures.length; i ++) {
            while (!stack.isEmpty() && temperatures[i] > stack.peek().temperature) {
                answer[stack.peek().index] = i - stack.peek().index;
                stack.pop();
            }
            stack.push(new Temperature(temperatures[i], i));
        }
        return answer;
    }

    public static void main(String[] args) {
      new DailyTemperatures().dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
    }
}

class Temperature {
    public int temperature;
    public int index;

    public Temperature(int temperature, int index) {
        this.temperature = temperature;
        this.index = index;
    }
}