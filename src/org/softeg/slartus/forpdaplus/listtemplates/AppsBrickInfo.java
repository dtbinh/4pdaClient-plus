package org.softeg.slartus.forpdaplus.listtemplates;

import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;

import org.softeg.slartus.forpdaplus.listfragments.AppsListFragment;

/**
 * Created by slinkin on 20.02.14.
 */
public class AppsBrickInfo extends BrickInfo {
    @Override
    public String getTitle() {
        return "Приложения";
    }

    @Override
    public String getName() {
        return "Applications";
    }

    @Override
    public Fragment createFragment() {
        return new AppsListFragment().setBrickInfo(this);
    }
}
