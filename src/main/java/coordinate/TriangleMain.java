package coordinate;

import coordinate.domain.Triangle;
import coordinate.view.InputView;
import coordinate.view.OutputView;

public class TriangleMain {
    public static void main(String[] args) {
        OutputView outputView = new OutputView();
        InputView inputView = new InputView();
        outputView.initNotice();
        Triangle triangle = inputView.triangleInit();
        outputView.main(triangle.getPoints());
        outputView.printTriangleResult(triangle);

    }
}
