
public class Main {
    public static void main(String[] args) {
        HRVPlot plotter = new HRVPlot();

        // 生成五力圖
        plotter.getFivePowerPlot(80, 70, 60, 50, 40);

        // 生成太極圖
        plotter.getTaiChiPlot(0.2, 50);
    }
}