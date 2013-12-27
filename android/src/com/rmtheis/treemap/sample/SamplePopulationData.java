/*
 * Copyright 2013 Robert Theis
 *
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
 */
package com.rmtheis.treemap.sample;

import java.util.Set;

import com.rmtheis.treemap.AndroidMapItem;

import edu.umd.cs.treemap.TreeModel;

public class SamplePopulationData {

    private Set<AndroidMapItem> androidMapItems;
    private TreeModel treeModel;

    public Set<AndroidMapItem> getItems() {
        return androidMapItems;
    }

    public TreeModel getTreeModel() {
        return treeModel;
    }

    public SamplePopulationData() {
        AndroidMapItem rootItem = new AndroidMapItem(7000000, "World");
        treeModel = new TreeModel(rootItem);
        treeModel.addChild(new TreeModel(new AndroidMapItem(32738376, "Afghanistan")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(3619778, "Albania")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(33769669, "Algeria")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(64827, "American Samoa")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(82627, "Andorra")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(12531357, "Angola")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(14108, "Anguilla")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(84522, "Antigua and Barbuda")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(40481998, "Argentina")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(2968586, "Armenia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(101541, "Aruba")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(21007310, "Australia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(8205533, "Austria")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(8177717, "Azerbaijan")));        
        treeModel.addChild(new TreeModel(new AndroidMapItem(307451, "Bahamas, The")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(718306, "Bahrain")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(153546901, "Bangladesh")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(281968, "Barbados")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(9685768, "Belarus")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(10403951, "Belgium")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(301270, "Belize")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(8532547, "Benin")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(66536, "Bermuda")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(682321, "Bhutan")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(9247816, "Bolivia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(4590310, "Bosnia and Herzegovina")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(1842323, "Botswana")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(196342587, "Brazil")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(381371, "Brunei")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(7262675, "Bulgaria")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(15264735, "Burkina Faso")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(47758181, "Burma")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(8691005, "Burundi")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(14241640, "Cambodia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(18467692, "Cameroon")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(33212696, "Canada")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(426998, "Cape Verde")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(47862, "Cayman Islands")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(4444330, "Central African Republic")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(10111337, "Chad")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(16454143, "Chile")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(1330044605, "China")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(45013674, "Colombia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(731775, "Comoros")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(3903318, "Congo (Brazzaville)")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(66514506, "Congo, DR")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(12271, "Cook Islands")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(4195914, "Costa Rica")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(20179602, "Cote d'Ivoire")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(4491543, "Croatia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(11423952, "Cuba")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(792604, "Cyprus")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(10220911, "Czech Republic")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(5484723, "Denmark")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(506221, "Djibouti")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(72514, "Dominica")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(9507133, "Dominican Republic")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(13927650, "Ecuador")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(81713517, "Egypt")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(7066403, "El Salvador")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(616459, "Equatorial Guinea")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(5502026, "Eritrea")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(1307605, "Estonia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(82544838, "Ethiopia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(48668, "Faroe Islands")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(931741, "Fiji")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(5244749, "Finland")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(64057790, "France")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(283019, "French Polynesia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(1485832, "Gabon")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(1735464, "Gambia, The")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(1500202, "Gaza Strip")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(4630841, "Georgia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(82369548, "Germany")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(23382848, "Ghana")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(28002, "Gibraltar")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(10722816, "Greece")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(57564, "Greenland")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(90343, "Grenada")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(175877, "Guam")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(13002206, "Guatemala")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(65726, "Guernsey")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(9806509, "Guinea")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(1503182, "Guinea-Bissau")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(770794, "Guyana")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(8924553, "Haiti")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(7639327, "Honduras")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(7018636, "Hong Kong S.A.R.")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(9930915, "Hungary")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(304367, "Iceland")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(1147995898, "India")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(237512355, "Indonesia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(65875223, "Iran")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(28221181, "Iraq")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(4156119, "Ireland")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(76220, "Isle of Man")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(7112359, "Israel")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(58145321, "Italy")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(2804332, "Jamaica")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(127288419, "Japan")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(91533, "Jersey")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(6198677, "Jordan")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(15340533, "Kazakhstan")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(37953838, "Kenya")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(110356, "Kiribati")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(23479089, "Korea, North")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(48379392, "Korea, South")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(2596799, "Kuwait")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(5356869, "Kyrgyzstan")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(6677534, "Laos")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(2245423, "Latvia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(3971941, "Lebanon")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(2128180, "Lesotho")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(3334587, "Liberia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(6173579, "Libya")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(34498, "Liechtenstein")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(3565205, "Lithuania")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(486006, "Luxembourg")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(545674, "Macau S.A.R.")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(2061315, "Macedonia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(20042551, "Madagascar")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(13931831, "Malawi")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(25274133, "Malaysia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(385925, "Maldives")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(12324029, "Mali")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(403532, "Malta")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(63174, "Marshall Islands")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(3364940, "Mauritania")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(1274189, "Mauritius")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(216306, "Mayotte")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(109955400, "Mexico")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(107665, "Micronesia, Federated States of")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(4324450, "Moldova")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(32796, "Monaco")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(2996081, "Mongolia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(678177, "Montenegro")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(5079, "Montserrat")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(34343219, "Morocco")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(21284701, "Mozambique")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(2088669, "Namibia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(13770, "Nauru")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(29519114, "Nepal")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(16645313, "Netherlands")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(225369, "Netherlands Antilles")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(224824, "New Caledonia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(4173460, "New Zealand")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(5785846, "Nicaragua")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(13272679, "Niger")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(146255306, "Nigeria")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(86616, "Northern Mariana Islands")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(4644457, "Norway")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(3311640, "Oman")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(172800051, "Pakistan")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(21093, "Palau")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(3309679, "Panama")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(5931769, "Papua New Guinea")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(6831306, "Paraguay")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(29180899, "Peru")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(96061683, "Philippines")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(38500696, "Poland")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(10676910, "Portugal")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(3958128, "Puerto Rico")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(824789, "Qatar")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(22246862, "Romania")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(140702094, "Russia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(10186063, "Rwanda")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(7492, "Saint Barthelemy")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(7601, "Saint Helena")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(39817, "Saint Kitts and Nevis")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(159585, "Saint Lucia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(29376, "Saint Martin")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(7044, "Saint Pierre and Miquelon")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(118432, "Saint Vincent and the Grenadines")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(217083, "Samoa")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(29973, "San Marino")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(206178, "Sao Tome and Principe")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(28146657, "Saudi Arabia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(12853259, "Senegal")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(10159046, "Serbia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(82247, "Seychelles")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(6294774, "Sierra Leone")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(4608167, "Singapore")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(5455407, "Slovakia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(2007711, "Slovenia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(581318, "Solomon Islands")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(9558666, "Somalia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(48782755, "South Africa")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(40491051, "Spain")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(21128773, "Sri Lanka")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(40218455, "Sudan")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(475996, "Suriname")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(1128814, "Swaziland")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(9045389, "Sweden")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(7581520, "Switzerland")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(19747586, "Syria")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(22920946, "Taiwan")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(7211884, "Tajikistan")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(40213162, "Tanzania")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(65493298, "Thailand")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(1108777, "Timor-Leste")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(5858673, "Togo")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(119009, "Tonga")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(1047366, "Trinidad and Tobago")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(10383577, "Tunisia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(71892807, "Turkey")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(5179571, "Turkmenistan")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(22352, "Turks and Caicos Islands")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(12177, "Tuvalu")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(31367972, "Uganda")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(45994287, "Ukraine")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(4621399, "United Arab Emirates")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(60943912, "United Kingdom")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(303824646, "United States")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(3477778, "Uruguay")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(27345026, "Uzbekistan")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(215446, "Vanuatu")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(26414815, "Venezuela")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(86116559, "Vietnam")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(24041, "Virgin Islands, British")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(109840, "Virgin Islands, U.S.")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(15237, "Wallis and Futuna")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(2407681, "West Bank")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(393831, "Western Sahara")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(23013376, "Yemen")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(11669534, "Zambia")));
        treeModel.addChild(new TreeModel(new AndroidMapItem(11350111, "Zimbabwe"))); 
    }

}
