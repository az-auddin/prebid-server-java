package org.prebid.server.functional.model.request.auction

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode
@ToString(includeNames = true, ignoreNulls = true)
class AssetImage {

    Integer type
    Integer w
    Integer wmin
    Integer h
    Integer hmin
    List<String> mimes
}
