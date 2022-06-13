package service.ui;

import enums.Feature;
import org.openqa.selenium.By;
import service.ui.UiTestExecutor.UiExecutorType;


public class ScreenshotService {

//  private static final UiTestExecutor UI_TEST_EXECUTOR = UiTestExecutorFactory.getInstance().get(UiExecutorType.UPDATE);
  private static final UiTestExecutor UI_TEST_EXECUTOR = UiTestExecutorFactory.getInstance().get(UiExecutorType.COMPARE);
// UPDATE - create new screenshot
// COMPARE - comparing created screenshot
  private ScreenshotService() {
  }

  public static void uiExecutor(
      final Feature feature,
      final By... ignoredElements
  ) {
    UI_TEST_EXECUTOR.execute(feature, ignoredElements);
  }


}
