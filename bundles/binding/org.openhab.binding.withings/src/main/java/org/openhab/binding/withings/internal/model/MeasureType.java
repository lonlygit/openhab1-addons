/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.withings.internal.model;

/**
 * Java object for response of Withings API.
 *
 * @see http://www.withings.com/de/api#bodymetrics
 * @author Dennis Nobel
 * @since 1.5.0
 */
public enum MeasureType {

    DIASTOLIC_BLOOD_PRESSURE(9),
    FAT_FREE_MASS(5),
    FAT_MASS_WEIGHT(8),
    FAT_RATIO(6),
    HEART_PULSE(11),
    HEIGHT(4),
    SYSTOLIC_BLOOD_PRESSURE(10),
    WEIGHT(1);

    public static MeasureType getForType(int type) {
        MeasureType[] measureTypes = values();
        for (MeasureType measureType : measureTypes) {
            if (measureType.type == type) {
                return measureType;
            }
        }
        return null;
    }

    public int type;

    private MeasureType(int type) {
        this.type = type;
    }
}
