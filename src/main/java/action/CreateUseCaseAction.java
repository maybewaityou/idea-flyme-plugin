package action;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import constant.Constant;
import org.jetbrains.annotations.NotNull;
import utils.ProjectUtils;

public class CreateUseCaseAction extends AnAction {

  @Override
  public void actionPerformed(@NotNull AnActionEvent e) {
    String rootPath = ProjectUtils.getRootPath(e);

    Notifications.Bus.notify(
        new Notification(Constant.PLUGIN_TAG, "文件信息", rootPath, NotificationType.INFORMATION));
  }
}
