package step2.service;

import step2.domain.LotteryWin;
import step2.domain.ManualLotto;
import step2.domain.PurchasedLotto;

public class LottoService {

    private final PurchasedLotto purchasedLottoList;

    public LottoService(PurchasedLotto purchasedLottoList) {
        this.purchasedLottoList = purchasedLottoList;
    }

    public void purchase(ManualLotto manualLotto) {
        purchasedLottoList.addManualLotto(manualLotto);
    }

    public PurchasedLotto matchResult(LotteryWin lotteryWin) {
        return lotteryWin.confirm2(purchasedLottoList);
    }
}
