/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package org.jd.gui.api.feature;

import org.jd.gui.api.model.Indexes;

import java.util.Collection;

public interface IndexesChangeListener {
    void indexesChanged(Collection<Indexes> collectionOfIndexes);
}
