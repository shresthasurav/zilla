/*
 * Copyright 2021-2022 Aklivity Inc.
 *
 * Aklivity licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.aklivity.zilla.build.maven.plugins.flyweight.internal.ast;

import java.util.List;

public final class AstStructMemberNode extends AstAbstractMemberNode
{
    private AstStructMemberNode(
        String name,
        List<AstType> types,
        int size,
        String sizeName,
        Object defaultValue,
        AstByteOrder byteOrder)
    {
        super(name, types, size, sizeName, defaultValue, byteOrder);
    }

    public static final class Builder extends AstAbstractMemberNode.Builder<AstStructMemberNode>
    {
        @Override
        public AstStructMemberNode build()
        {
            return new AstStructMemberNode(name, types, size, sizeName, defaultValue, byteOrder);
        }
    }
}