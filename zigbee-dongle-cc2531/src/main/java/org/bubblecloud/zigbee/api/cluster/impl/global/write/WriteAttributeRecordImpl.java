/*
   Copyright 2008-2013 CNR-ISTI, http://isti.cnr.it
   Institute of Information Science and Technologies 
   of the Italian National Research Council 


   See the NOTICE file distributed with this work for additional 
   information regarding copyright ownership

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package org.bubblecloud.zigbee.api.cluster.impl.global.write;

import org.bubblecloud.zigbee.api.cluster.impl.api.core.Attribute;
import org.bubblecloud.zigbee.v3.model.ZigBeeType;
import org.bubblecloud.zigbee.api.cluster.impl.api.global.WriteAttributeRecord;

/**
 * @author <a href="mailto:stefano.lenzi@isti.cnr.it">Stefano "Kismet" Lenzi</a>
 * @author <a href="mailto:francesco.furfari@isti.cnr.it">Francesco Furfari</a>
 * @version $LastChangedRevision: 799 $ ($LastChangedDate: 2013-08-06 19:00:05 +0300 (Tue, 06 Aug 2013) $)
 */
public class WriteAttributeRecordImpl implements WriteAttributeRecord {

    private Attribute attribute;
    private Object value;

    public WriteAttributeRecordImpl(Attribute attribute, Object value) {
        this.attribute = attribute;
        this.value = value;
    }

    public Object getAttributeData() {
        return value;
    }

    public ZigBeeType getAttributeDataType() {
        return attribute.getZigBeeType();
    }

    public int getAttributeId() {
        return attribute.getId();
    }
}
