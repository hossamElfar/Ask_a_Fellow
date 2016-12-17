package com.example.baher.ask_a_fellow.ViewAndAnswerQuestion;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE OPEN GROUP BE LIABLE
 * FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AnswerData {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("answer")
    @Expose
    private String answer;
    @SerializedName("question_id")
    @Expose
    private int questionId;
    @SerializedName("responder_id")
    @Expose
    private int responderId;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("votes")
    @Expose
    private int votes;
    @SerializedName("responder")
    @Expose
    private AnswerResponder responder;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getResponderId() {
        return responderId;
    }

    public void setResponderId(int responderId) {
        this.responderId = responderId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public AnswerResponder getResponder() {
        return responder;
    }

    public void setResponder(AnswerResponder responder) {
        this.responder = responder;
    }

    @Override
    public String toString() {
        return "AnswerData{" +
                "id=" + id +
                ", answer='" + answer + '\'' +
                ", questionId=" + questionId +
                ", responderId=" + responderId +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", votes=" + votes +
                ", responder=" + responder +
                '}';
    }
}
