/*
 * Copyright (c) 2014 T-Systems Multimedia Solutions GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * AppMon Server REST API
 * The AppMon Server exposes management and integration functionality via REST endpoints. This interactive documentation also acts as a REST client you can use to interact with the AppMon Server.  The HTTP status code of the response shows the result of your request. The expected response code for a successful request is documented individually per REST endpoint. Additionally the following error response codes can typically occur in our REST interface:  * **400** - Bad Request: Some request parameters are not correct. * **401** - Unauthorized: A valid authorization header (Basic Authentication) is required but is not available. * **403** - Forbidden: Execution of request is not allowed, e.g. the user has no privileges. * **404** - Not Found: Endpoint does not exist or some entities could not be found, e.g. System Profile. * **500** - Internal Server Error: See response body for details.  Additional [usage examples](https://www.dynatrace.com/support/doc/appmon70/shortlink/id_server_rest_examples) can be found in the AppMon documentation. 
 *
 * OpenAPI spec version: 2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package de.tsystems.mms.apm.performancesignature.dynatrace.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import org.kohsuke.stapler.export.Exported;
import org.kohsuke.stapler.export.ExportedBean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TestResult
 */

@ExportedBean
public class TestResult {
    @SerializedName("name")
    private String name;

    @SerializedName("status")
    private StatusEnum status;

    @SerializedName("exectime")
    private String exectime;

    @SerializedName("package")
    private String _package;

    @SerializedName("platform")
    private String platform;

    @SerializedName("measures")
    private List<TestMeasure> measures;

    /**
     * Get name
     *
     * @return name
     **/
    @Exported
    @ApiModelProperty()
    public String getName() {
        return name;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @Exported
    @ApiModelProperty()
    public StatusEnum getStatus() {
        return status;
    }

    /**
     * Start time of the test in ISO 8601 compatible date/time of format: yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX
     *
     * @return exectime
     **/
    @Exported
    @ApiModelProperty(example = "2016-07-18T16:44:00.055+02:00", value = "Start time of the test in ISO 8601 compatible date/time of format: yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    public String getExectime() {
        return exectime;
    }

    /**
     * Get _package
     *
     * @return _package
     **/
    @Exported
    @ApiModelProperty()
    public String getPackage() {
        return _package;
    }

    /**
     * Get platform
     *
     * @return platform
     **/
    @Exported
    @ApiModelProperty()
    public String getPlatform() {
        return platform;
    }

    public TestResult measures(List<TestMeasure> measures) {
        this.measures = measures;
        return this;
    }

    public TestResult addMeasuresItem(TestMeasure measuresItem) {
        if (this.measures == null) {
            this.measures = new ArrayList<>();
        }
        this.measures.add(measuresItem);
        return this;
    }

    /**
     * Get measures
     *
     * @return measures
     **/
    @Exported
    @ApiModelProperty()
    public List<TestMeasure> getMeasures() {
        return measures;
    }

    public void setMeasures(List<TestMeasure> measures) {
        this.measures = measures;
    }

    public String getStatusIcon() {
        switch (status) {
            case PASSED:
                return "glyphicon-ok";
            case FAILED:
                return "glyphicon-remove-sign";
            case IMPROVED:
                return "glyphicon-arrow-up";
            case DEGRADED:
                return "glyphicon-arrow-down";
            case VOLATILE:
                return "glyphicon-sort";
            default:
                return "";
        }
    }

    public String getStatusColor() {
        switch (status) {
            case PASSED:
                return "#2AB06F";
            case FAILED:
                return "#DC172A";
            case IMPROVED:
                return "#2AB6F4";
            case DEGRADED:
                return "#EF651F";
            case VOLATILE:
                return "#FFE11C";
            default:
                return "";
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestResult {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    exectime: ").append(toIndentedString(exectime)).append("\n");
        sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    measures: ").append(toIndentedString(measures)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Gets or Sets category
     */
    @JsonAdapter(TestResult.StatusEnum.Adapter.class)
    public enum StatusEnum {
        FAILED("Failed"),
        VOLATILE("Volatile"),
        DEGRADED("Degraded"),
        IMPROVED("Improved"),
        PASSED("Passed"),
        NONE("None");

        private final String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public static TestResult.StatusEnum fromValue(String text) {
            for (TestResult.StatusEnum b : TestResult.StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<TestResult.StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TestResult.StatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TestResult.StatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TestResult.StatusEnum.fromValue(String.valueOf(value));
            }
        }
    }
}
