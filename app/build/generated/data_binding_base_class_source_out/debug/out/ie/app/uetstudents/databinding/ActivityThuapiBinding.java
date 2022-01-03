// Generated by view binder compiler. Do not edit!
package ie.app.uetstudents.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ie.app.uetstudents.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityThuapiBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView thuapi;

  private ActivityThuapiBinding(@NonNull ConstraintLayout rootView, @NonNull RecyclerView thuapi) {
    this.rootView = rootView;
    this.thuapi = thuapi;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityThuapiBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityThuapiBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_thuapi, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityThuapiBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.thuapi;
      RecyclerView thuapi = ViewBindings.findChildViewById(rootView, id);
      if (thuapi == null) {
        break missingId;
      }

      return new ActivityThuapiBinding((ConstraintLayout) rootView, thuapi);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
