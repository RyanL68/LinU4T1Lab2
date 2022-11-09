public class WhileLoopFun {
    public WhileLoopFun() { }

    public void printDigits(int number) {
        int newNumber = number;
        while (newNumber > 0){
            System.out.println(newNumber % 10);
            newNumber=newNumber/10;
        }
    }
    public int countLetter(String word, String letter) {
        int count = 0;
        int index = 0;
        while (index<word.length()){
            String nextLetter = word.substring(index, index+1);
            if(nextLetter.equals(letter)){
                count++;
            }
            index++;
        }
        return count;
    }
    public int maxDoubles(int number, int threshold) {
        int doubles = 0;
        int doubleAmount = number*2;
        while(doubleAmount<=threshold){
            doubles++;
        }
        return doubles;
    }
    public boolean isPrime(int number) {
        if (number == 1){
            return false;
        }
        int curDivisor = 2;
        while(curDivisor<number){
            if(number%curDivisor==0){
                return false;
            }
            curDivisor++;
        }
        return true;
    }
}
