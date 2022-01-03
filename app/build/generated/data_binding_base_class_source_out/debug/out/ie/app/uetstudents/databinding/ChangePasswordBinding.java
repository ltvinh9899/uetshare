// Generated by view binder compiler. Do not edit!
package ie.app.uetstudents.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ie.app.uetstudents.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ChangePasswordBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button capnhatPassword;

  @NonNull
  public final EditText dialogNewPassword;

  @NonNull
  public final EditText dialogOldPassword;

  @NonNull
  public final EditText dialogReoldPassword;

  @NonNull
  public final TextView dialogTitleChange;

  private ChangePasswordBinding(@NonNull LinearLayout rootView, @NonNull Button capnhatPassword,
      @NonNull EditText dialogNewPassword, @NonNull EditText dialogOldPassword,
      @NonNull EditText dialogReoldPassword, @NonNull TextView dialogTitleChange) {
    this.rootView = rootView;
    this.capnhatPassword = capnhatPassword;
    this.dialogNewPassword = dialogNewPassword;
    this.dialogOldPassword = dialogOldPassword;
    this.dialogReoldPassword = dialogReoldPassword;
    this.dialogTitleChange = dialogTitleChange;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ChangePasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ChangePasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.change_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ChangePasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.capnhat_password;
      Button capnhatPassword = ViewBindings.findChildViewById(rootView, id);
      if (capnhatPassword == null) {
        break missingId;
      }

      id = R.id.dialog_new_password;
      EditText dialogNewPassword = ViewBindings.findChildViewById(rootView, id);
      if (dialogNewPassword == null) {
        break missingId;
      }

      id = R.id.dialog_old_password;
      EditText dialogOldPassword = ViewBindings.findChildViewById(rootView, id);
      if (dialogOldPassword == null) {
        break missingId;
      }

      id = R.id.dialog_reold_password;
      EditText dialogReoldPassword = ViewBindings.findChildViewById(rootView, id);
      if (dialogReoldPassword == null) {
        break missingId;
      }

      id = R.id.dialog_title_change;
      TextView dialogTitleChange = ViewBindings.findChildViewById(rootView, id);
      if (dialogTitleChange == null) {
        break missingId;
      }

      return new ChangePasswordBinding((LinearLayout) rootView, capnhatPassword, dialogNewPassword,
          dialogOldPassword, dialogReoldPassword, dialogTitleChange);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
