//
//  TextView.swift
//  iosApp
//
//  Created by Lucas Prioste on 11/06/2025.
//

import SwiftUI
import ComposeApp

struct TextView: View {
    @StateObject private var textViewStateObserver = TextViewStateObserver()
    var valueFlow: CommonFlow<NSString>
    
    var body: some View {
        Text(textViewStateObserver.value)
            .onAppear {
                textViewStateObserver.startObserving(flow: valueFlow)
            }
            .onDisappear {
                textViewStateObserver.stopObserving()
            }
    }
}
