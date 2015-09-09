
/*
 * *
 *  * Copyright 2015 IBM Corp. All Rights Reserved.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.ibm.watson.developer_cloud.alchemy_news.v1.Model;

import com.ibm.watson.developer_cloud.alchemy_news.v1.AlchemyDataNews;

/**
 * Sentiment by the {@link AlchemyDataNews} service.
 *
 * @author Nizar Alseddeg (nmalsedd@us.ibm.com)
 */
public class Sentiment {

    private int mixed;

    private double score;

    private String type;

    /**
     * @return The mixed
     */
    public int getMixed() {
        return mixed;
    }

    /**
     * @param mixed The mixed
     */
    public void setMixed(int mixed) {
        this.mixed = mixed;
    }

    public Sentiment withMixed(int mixed) {
        this.mixed = mixed;
        return this;
    }

    /**
     * @return The score
     */
    public double getScore() {
        return score;
    }

    /**
     * @param score The score
     */
    public void setScore(int score) {
        this.score = score;
    }

    public Sentiment withScore(int score) {
        this.score = score;
        return this;
    }

    /**
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
        this.type = type;
    }

    public Sentiment withType(String type) {
        this.type = type;
        return this;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Sentiment sentiment = (Sentiment) o;
//
//        if (mixed != sentiment.mixed) return false;
//        if (score != sentiment.score) return false;
//        return !(type != null ? !type.equals(sentiment.type) : sentiment.type != null);
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result = mixed;
//        result = 31 * result + score;
//        result = 31 * result + (type != null ? type.hashCode() : 0);
//        return result;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sentiment sentiment = (Sentiment) o;

        if (mixed != sentiment.mixed) return false;
        if (Double.compare(sentiment.score, score) != 0) return false;
        return !(type != null ? !type.equals(sentiment.type) : sentiment.type != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = mixed;
        temp = Double.doubleToLongBits(score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Sentiment [type=%s,score=%s]", type, score);
    }
}
