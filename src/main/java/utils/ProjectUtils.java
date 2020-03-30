package utils;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;

public class ProjectUtils {

  public static String getName(AnActionEvent e) {
    return CommonDataKeys.PROJECT.getData(e.getDataContext()).getName();
  }

  public static String getRootPath(AnActionEvent e) {
    return CommonDataKeys.PROJECT.getData(e.getDataContext()).getBasePath();
  }
}
