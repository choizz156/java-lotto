package step2.domain;

import java.util.ArrayList;
import java.util.List;
import step2.utils.Conversion;
import step2.utils.Split;

public class WinningNumbers {

    private final List<Integer> numbers = new ArrayList<>();

    public WinningNumbers(String winningNumber) {
        String[] winningNumbers = Split.getStrings(winningNumber);
        for (String number : winningNumbers) {
            this.numbers.add(Conversion.stringToInt(number));
        }
    }

    public WinningNumbers(List<Integer> winningNumbers) {
        this.numbers.addAll(winningNumbers);
    }

    public List<Integer> get() {
        return this.numbers;
    }

    public boolean confirm(int number) {
        return this.numbers.contains(number);
    }
}
