package coordinate;

import coordinate.domain.Line;
import coordinate.domain.Square;
import coordinate.view.InputView;
import coordinate.view.OutputView;

public class SquareMain {

    public static void main(String[] args) {
        OutputView outputView = new OutputView();
        InputView inputView = new InputView();

        outputView.initNotice();
//        Line line = inputView.lineInit();
//        OutputView.main(line.getPoints());
//        OutputView.printResult(line);
        Square square = inputView.squareInit();
        outputView.main(square.getPoints());
        outputView.printSquareResult(square);

    }
}
