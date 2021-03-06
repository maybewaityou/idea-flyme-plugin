package action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

public class CreateNativePluginAction extends AnAction {

  @Override
  public void actionPerformed(@NotNull AnActionEvent e) {
    Project project = e.getData(PlatformDataKeys.PROJECT);

    String title = "hello";
    String msg = "native plugin";

    Messages.showMessageDialog(project, msg, title, Messages.getInformationIcon());
  }
}
