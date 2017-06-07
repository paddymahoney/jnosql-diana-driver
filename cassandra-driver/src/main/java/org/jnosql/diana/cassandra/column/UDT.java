/*
 *  Copyright (c) 2017 Otávio Santana and others
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   and Apache License v2.0 which accompanies this distribution.
 *   The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 *   and the Apache License v2.0 is available at http://www.opensource.org/licenses/apache2.0.php.
 *
 *   You may elect to redistribute this code under either of these licenses.
 *
 *   Contributors:
 *
 *   Otavio Santana
 */
package org.jnosql.diana.cassandra.column;


import org.jnosql.diana.api.column.Column;

import java.util.List;

/**
 * A Cassandra user data type, this interface does not support both Value alias method:
 * get(class) and get(TypeSupplier);
 */
public interface UDT extends Column {

    /**
     * The UDT name
     *
     * @return the UDT name
     */
    String getUserType();

    /**
     * The columns at this UDT
     *
     * @return the fields at UDT
     */
    List<Column> getColumns();

    /**
     * Returns a UDT builder
     *
     * @return the {@link UDTBuilder} instance
     */
    static UDTBuilder builder() {
        return new UDTBuilder();
    }
}
