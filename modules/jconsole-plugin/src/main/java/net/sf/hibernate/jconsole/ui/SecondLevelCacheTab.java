/*
 * Copyright (c) 2010
 *
 * This file is part of HibernateJConsole.
 *
 *     HibernateJConsole is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     HibernateJConsole is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with HibernateJConsole.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.hibernate.jconsole.ui;

/**
 * * Implements the cache page.
 *
 * @author Juergen_Kellerer, 2009-11-20
 * @version 1.0
 */
public class SecondLevelCacheTab extends AbstractTableTab {

	public static final String NAME = "Cache";

	SecondLevelCacheTable cacheTable = new SecondLevelCacheTable();
	SecondLevelCacheDetails cacheDetails = new SecondLevelCacheDetails(cacheTable);

	public SecondLevelCacheTab() {
		super();
		init(cacheDetails);
	}
}

