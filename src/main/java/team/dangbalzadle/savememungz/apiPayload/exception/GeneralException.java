package team.dangbalzadle.savememungz.apiPayload.exception;

import team.dangbalzadle.savememungz.apiPayload.code.BaseErrorCode;
import team.dangbalzadle.savememungz.apiPayload.code.ErrorReasonDTO;

public class GeneralException extends RuntimeException {
    private BaseErrorCode code;

    public GeneralException(BaseErrorCode code) {
        super(code.getReason().getMessage());
        this.code = code;
    }

    public ErrorReasonDTO getErrorReason() {
        return this.code.getReason();
    }

    public ErrorReasonDTO getErrorReasonHttpStatus(){
        return this.code.getReasonHttpStatus();
    }
}
