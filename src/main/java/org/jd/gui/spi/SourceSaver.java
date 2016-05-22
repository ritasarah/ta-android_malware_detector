/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package org.jd.gui.spi;

import org.jd.gui.api.API;
import org.jd.gui.api.model.Container;

import java.nio.file.Path;
import java.util.regex.Pattern;

public interface SourceSaver {
    public String[] getSelectors();

    public Pattern getPathPattern();

    public String getSourcePath(Container.Entry entry);

    public int getFileCount(API api, Container.Entry entry);

    /**
     * Check parent path, build source file name, create NIO path and save the content.
     */
    public void save(API api, Controller controller, Listener listener, Path rootPath, Container.Entry entry);

    /**
     * Save content:
     * <ul>
     * <li>For file, save the source content.</li>
     * <li>For directory, call 'save' for each children.</li>
     * </ul>
     */
    public void saveContent(API api, Controller controller, Listener listener, Path rootPath, Path path, Container.Entry entry);

    public interface Controller {
        public boolean isCancelled();
    }

    public interface Listener {
        public void pathSaved(Path path);
    }
}
