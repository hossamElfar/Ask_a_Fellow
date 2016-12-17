package com.example.baher.ask_a_fellow.Common;

import com.example.baher.ask_a_fellow.ViewAndAnswerQuestion.AnswerPOJO;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE OPEN GROUP BE LIABLE
 * FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
public interface APIEndPointInterface {
    @GET("answers/{id}/votes")
    Call<AnswerPOJO> getAnswer(@Path("id") String id);
}
