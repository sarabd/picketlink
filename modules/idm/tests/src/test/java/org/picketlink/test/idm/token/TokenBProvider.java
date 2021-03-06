/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.picketlink.test.idm.token;

import org.picketlink.idm.PartitionManager;
import org.picketlink.idm.credential.storage.TokenCredentialStorage;

import java.util.Date;

/**
 * @author Pedro Igor
 */
public class TokenBProvider extends AbstractTokenProvider<TokenB> {

    public TokenBProvider(PartitionManager partitionManager, Date expirationTime) {
        super(partitionManager, expirationTime);
    }

    public TokenBProvider(PartitionManager partitionManager) {
        this(partitionManager, null);
    }

    @Override
    public Class<TokenB> getTokenType() {
        return TokenB.class;
    }

    @Override
    protected Class<? extends TokenCredentialStorage> getCredentialStorageType() {
        return TokenBCredentialHandler.TokenBCredentialStorage.class;
    }
}
