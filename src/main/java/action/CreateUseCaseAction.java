package action;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.samskivert.mustache.Mustache;
import com.samskivert.mustache.Template;
import constant.Constant;
import org.jetbrains.annotations.NotNull;
import utils.ProjectUtils;

import java.util.HashMap;
import java.util.Map;

public class CreateUseCaseAction extends AnAction {

  @Override
  public void actionPerformed(@NotNull AnActionEvent e) {
    String rootPath = ProjectUtils.getRootPath(e);

    String targetString = "== {{name}} ==";
    Template template = Mustache.compiler().compile(targetString);
    Map<String, String> data = new HashMap();
    data.put("name", "zhangsan");
    String result = template.execute(data);

    Notifications.Bus.notify(
        new Notification(Constant.PLUGIN_TAG, result, rootPath, NotificationType.INFORMATION));
  }
}
