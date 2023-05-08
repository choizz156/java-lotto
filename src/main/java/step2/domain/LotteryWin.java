package step2.domain;

import java.util.List;

public class LotteryWin {

    private final WinningNumbers winningNumbers;
    private final BonusNumber bonusNumber;

    public LotteryWin(WinningNumbers winningNumbers, int bonusNumber) {
        this.winningNumbers = winningNumbers;
        validateDuplication(winningNumbers.get(), bonusNumber);
        this.bonusNumber = new BonusNumber(bonusNumber);
    }

    public PurchasedLotto confirm(PurchasedLotto purchasedLotto) {
        return purchasedLotto.applyRanking(this.winningNumbers, this.bonusNumber);
    }

    private void validateDuplication(List<Integer> winningNumbers, int bonusNumber) {
        if (winningNumbers.contains(bonusNumber)) {
            throw new IllegalArgumentException("이미 존재하는 번호입니다.");
        }
    }
}
