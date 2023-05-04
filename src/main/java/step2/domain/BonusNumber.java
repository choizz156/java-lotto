package step2.domain;

import step2.utils.Validation;

public class BonusNumber {

    private final int number;

    public BonusNumber(int bonusNumber) {
        Validation.rangeOfNumber(bonusNumber);
        this.number = bonusNumber;
    }

    public boolean isContained(Lotto lotto) {
        return lotto.containBonusNumber(this.number);
    }
}
