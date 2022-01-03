// Generated by view binder compiler. Do not edit!
package ie.app.uetstudents.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ie.app.uetstudents.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNotificationsBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final FrameLayout framlayoutNotification;

  @NonNull
  public final RecyclerView notificationRecyclerview;

  @NonNull
  public final NestedScrollView notificationScrollview;

  @NonNull
  public final ProgressBar progressBarNotifi;

  private ActivityNotificationsBinding(@NonNull FrameLayout rootView,
      @NonNull FrameLayout framlayoutNotification, @NonNull RecyclerView notificationRecyclerview,
      @NonNull NestedScrollView notificationScrollview, @NonNull ProgressBar progressBarNotifi) {
    this.rootView = rootView;
    this.framlayoutNotification = framlayoutNotification;
    this.notificationRecyclerview = notificationRecyclerview;
    this.notificationScrollview = notificationScrollview;
    this.progressBarNotifi = progressBarNotifi;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNotificationsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNotificationsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_notifications, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNotificationsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      FrameLayout framlayoutNotification = (FrameLayout) rootView;

      id = R.id.notification_recyclerview;
      RecyclerView notificationRecyclerview = ViewBindings.findChildViewById(rootView, id);
      if (notificationRecyclerview == null) {
        break missingId;
      }

      id = R.id.notification_scrollview;
      NestedScrollView notificationScrollview = ViewBindings.findChildViewById(rootView, id);
      if (notificationScrollview == null) {
        break missingId;
      }

      id = R.id.progress_bar_notifi;
      ProgressBar progressBarNotifi = ViewBindings.findChildViewById(rootView, id);
      if (progressBarNotifi == null) {
        break missingId;
      }

      return new ActivityNotificationsBinding((FrameLayout) rootView, framlayoutNotification,
          notificationRecyclerview, notificationScrollview, progressBarNotifi);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
