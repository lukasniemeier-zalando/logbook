package org.zalando.logbook;

/*
 * #%L
 * Logbook: Core
 * %%
 * Copyright (C) 2015 Zalando SE
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

public abstract class ForwardingHttpMessage implements HttpMessage {

    protected abstract HttpMessage delegate();

    @Override
    public String getProtocolVersion() {
        return delegate().getProtocolVersion();
    }

    @Override
    public Map<String, List<String>> getHeaders() {
        return delegate().getHeaders();
    }

    @Override
    public String getContentType() {
        return delegate().getContentType();
    }

    @Override
    public Charset getCharset() {
        return delegate().getCharset();
    }

    @Override
    public Origin getOrigin() {
        return delegate().getOrigin();
    }

    @Override
    public byte[] getBody() throws IOException {
        return delegate().getBody();
    }

    @Override
    public String getBodyAsString() throws IOException {
        return delegate().getBodyAsString();
    }

    @Override
    public String toString() {
        return delegate().toString();
    }
}
