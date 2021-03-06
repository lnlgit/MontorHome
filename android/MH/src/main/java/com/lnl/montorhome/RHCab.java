package com.lnl.montorhome;

/**
 * Created by James Park
 * email: jim@linuxnetworks.co.uk
 * Date: 8/2/2559.
 */
public class RHCab extends BaseShape {

    float lineCoords[] =  {
            -0.427739f, -0.2836f, -0.25f,
            -0.442176f, -0.2836f, -0.25f,
            -0.442794f, -0.280857f, -0.25f,
            -0.443411f, -0.278156f, -0.25f,
            -0.444028f, -0.275496f, -0.25f,
            -0.444645f, -0.272877f, -0.25f,
            -0.445263f, -0.270299f, -0.25f,
            -0.445880f, -0.267759f, -0.25f,
            -0.446497f, -0.265259f, -0.25f,
            -0.447114f, -0.262798f, -0.25f,
            -0.447732f, -0.260374f, -0.25f,
            -0.448349f, -0.257988f, -0.25f,
            -0.448966f, -0.255639f, -0.25f,
            -0.449583f, -0.253327f, -0.25f,
            -0.450098f, -0.251541f, -0.25f,
            -0.450671f, -0.249775f, -0.25f,
            -0.451294f, -0.248027f, -0.25f,
            -0.451960f, -0.246293f, -0.25f,
            -0.452662f, -0.244571f, -0.25f,
            -0.453391f, -0.242859f, -0.25f,
            -0.454141f, -0.241155f, -0.25f,
            -0.454903f, -0.239454f, -0.25f,
            -0.455671f, -0.237757f, -0.25f,
            -0.456436f, -0.236058f, -0.25f,
            -0.457191f, -0.234357f, -0.25f,
            -0.457929f, -0.232651f, -0.25f,
            -0.458306f, -0.231866f, -0.25f,
            -0.458615f, -0.231168f, -0.25f,
            -0.458895f, -0.230505f, -0.25f,
            -0.459185f, -0.229829f, -0.25f,
            -0.459525f, -0.229091f, -0.25f,
            -0.459954f, -0.22824f, -0.25f,
            -0.460511f, -0.227227f, -0.25f,
            -0.461237f, -0.226004f, -0.25f,
            -0.462169f, -0.224519f, -0.25f,
            -0.463348f, -0.222725f, -0.25f,
            -0.464813f, -0.22057f, -0.25f,
            -0.466603f, -0.218007f, -0.25f,
            -0.467139f, -0.217514f, -0.25f,
            -0.467693f, -0.216971f, -0.25f,
            -0.468273f, -0.216383f, -0.25f,
            -0.468886f, -0.21575f, -0.25f,
            -0.469542f, -0.215074f, -0.25f,
            -0.470248f, -0.214357f, -0.25f,
            -0.471011f, -0.213602f, -0.25f,
            -0.471841f, -0.21281f, -0.25f,
            -0.472745f, -0.211984f, -0.25f,
            -0.473731f, -0.211124f, -0.25f,
            -0.474807f, -0.210234f, -0.25f,
            -0.475981f, -0.209315f, -0.25f,
            -0.476023f, -0.209227f, -0.25f,
            -0.476254f, -0.208998f, -0.25f,
            -0.476699f, -0.208648f, -0.25f,
            -0.477385f, -0.208193f, -0.25f,
            -0.478338f, -0.207653f, -0.25f,
            -0.479583f, -0.207044f, -0.25f,
            -0.481146f, -0.206386f, -0.25f,
            -0.483054f, -0.205696f, -0.25f,
            -0.485331f, -0.204992f, -0.25f,
            -0.488005f, -0.204293f, -0.25f,
            -0.491101f, -0.203615f, -0.25f,
            -0.494644f, -0.202978f, -0.25f,
            -0.499298f, -0.20227f, -0.25f,
            -0.503712f, -0.201686f, -0.25f,
            -0.507914f, -0.201214f, -0.25f,
            -0.511928f, -0.200843f, -0.25f,
            -0.515781f, -0.200562f, -0.25f,
            -0.519499f, -0.200359f, -0.25f,
            -0.523108f, -0.200224f, -0.25f,
            -0.526634f, -0.200144f, -0.25f,
            -0.530102f, -0.20011f, -0.25f,
            -0.533539f, -0.200109f, -0.25f,
            -0.536970f, -0.20013f, -0.25f,
            -0.540422f, -0.200162f, -0.25f,
            -0.544507f, -0.200207f, -0.25f,
            -0.548587f, -0.200269f, -0.25f,
            -0.552663f, -0.200355f, -0.25f,
            -0.556740f, -0.20047f, -0.25f,
            -0.560819f, -0.200623f, -0.25f,
            -0.564905f, -0.200821f, -0.25f,
            -0.569000f, -0.20107f, -0.25f,
            -0.573108f, -0.201377f, -0.25f,
            -0.577231f, -0.20175f, -0.25f,
            -0.581372f, -0.202195f, -0.25f,
            -0.585534f, -0.202719f, -0.25f,
            -0.589721f, -0.20333f, -0.25f,
            -0.594868f, -0.204198f, -0.25f,
            -0.599510f, -0.205353f, -0.25f,
            -0.603676f, -0.206749f, -0.25f,
            -0.607395f, -0.208338f, -0.25f,
            -0.610697f, -0.210073f, -0.25f,
            -0.613610f, -0.211908f, -0.25f,
            -0.616165f, -0.213793f, -0.25f,
            -0.618390f, -0.215684f, -0.25f,
            -0.620315f, -0.217531f, -0.25f,
            -0.621969f, -0.219288f, -0.25f,
            -0.623381f, -0.220907f, -0.25f,
            -0.624582f, -0.222342f, -0.25f,
            -0.624788f, -0.222698f, -0.25f,
            -0.625371f, -0.223704f, -0.25f,
            -0.626277f, -0.225268f, -0.25f,
            -0.627451f, -0.227296f, -0.25f,
            -0.628841f, -0.229697f, -0.25f,
            -0.630392f, -0.232375f, -0.25f,
            -0.632051f, -0.23524f, -0.25f,
            -0.633764f, -0.238197f, -0.25f,
            -0.635476f, -0.241155f, -0.25f,
            -0.637135f, -0.244019f, -0.25f,
            -0.638686f, -0.246698f, -0.25f,
            -0.640076f, -0.249098f, -0.25f,
            -0.724941f, -0.248042f, -0.25f,
            -0.724941f, -0.220581f, -0.25f,
            -0.724900f, -0.161616f, -0.25f,
            -0.724870f, -0.117428f, -0.25f,
            -0.724584f, -0.114496f, -0.25f,
            -0.724161f, -0.111904f, -0.25f,
            -0.723599f, -0.10962f, -0.25f,
            -0.722899f, -0.107614f, -0.25f,
            -0.722059f, -0.105856f, -0.25f,
            -0.721078f, -0.104316f, -0.25f,
            -0.719955f, -0.102962f, -0.25f,
            -0.718689f, -0.101765f, -0.25f,
            -0.717280f, -0.100694f, -0.25f,
            -0.715726f, -0.099719f, -0.25f,
            -0.714027f, -0.09881f, -0.25f,
            -0.712181f, -0.097935f, -0.25f,
            -0.709977f, -0.097115f, -0.25f,
            -0.703748f, -0.094798f, -0.25f,
            -0.694069f, -0.091197f, -0.25f,
            -0.681516f, -0.086527f, -0.25f,
            -0.666662f, -0.081001f, -0.25f,
            -0.650084f, -0.074834f, -0.25f,
            -0.632356f, -0.068239f, -0.25f,
            -0.614053f, -0.06143f, -0.25f,
            -0.595749f, -0.054621f, -0.25f,
            -0.578021f, -0.048026f, -0.25f,
            -0.561443f, -0.041859f, -0.25f,
            -0.546589f, -0.036333f, -0.25f,
            -0.447811f, 0.130775f, -0.25f,
            -0.252024f, 0.130775f, -0.25f,
            -0.252024f, -0.282423f, -0.25f,
    };

    short drawOrder[] = {  0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                            11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                            21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                            31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                            41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                            51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                            61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                            71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                            81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                            91, 92, 93, 94, 95, 96, 97, 98, 99, 100,
                            101, 102, 103, 104, 105, 106, 107, 108, 109, 110,
                            111, 112, 113, 114, 115, 116, 117, 118, 119, 120,
                            121, 122, 123, 124, 125, 126, 127, 128, 129, 130,
                            131, 132, 133, 134, 135, 136, 137, 138, 139, 140
                        };


    public RHCab(){
        this.initVertexBuff(lineCoords);
        this.initListBuff(drawOrder);
    }
}
